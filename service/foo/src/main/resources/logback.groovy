import ch.qos.logback.classic.PatternLayout
import ch.qos.logback.classic.encoder.PatternLayoutEncoder
import ch.qos.logback.core.rolling.RollingFileAppender
import ch.qos.logback.core.rolling.SizeAndTimeBasedRollingPolicy
import java.nio.charset.Charset
import static ch.qos.logback.classic.Level.*


loggerGroup("service", DEBUG, "pl.pragmaticdevs")

myAppender("system")
root(INFO, ["system"])


def myAppender(name) {
    def configuration = System.getProperty("logs.appender", "files")
    def dir = System.getProperty("logs.dir", "logs/service/foo")
    def charsetName = System.getProperty("logs.charset", "UTF-8")

    if("files".equalsIgnoreCase(configuration)) {
        appender(name, RollingFileAppender) {
            file = "${dir}/${name}.log"
            rollingPolicy(SizeAndTimeBasedRollingPolicy) {
                fileNamePattern = "${dir}/archives/${name}_%d{yyyy-MM-dd}.%i.log"
                maxFileSize = "100MB"
                maxHistory = 60
                totalSizeCap = "20GB"
            }
            encoder(PatternLayoutEncoder) {
                charset = Charset.forName(charsetName)
                pattern = "%d{yyyy-MM-dd HH:mm:ss.SSS} [%thread] %-5level %logger{36} - %msg%n%ex{full}"
            }
        }
    } else {
        appender(name, ConsoleAppender) {
            encoder(PatternLayoutEncoder) {
                charset = Charset.forName(charsetName)
                pattern = "%d{yyyy-MM-dd HH:mm:ss.SSS} [%thread] %-5level %logger{36} - %msg%n%ex{full}"
            }
        }
    }
}

def loggerGroup (name, level, String[] loggerNames) {
    myAppender(name)

    loggerNames.each {loggerName -> logger(loggerName, level, [name], false)}
}