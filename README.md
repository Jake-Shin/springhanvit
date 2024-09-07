resources 폴더 밑에 application.properties 파일 만들어야 함
안에 내용은
spring.application.name=hancom
spring.mvc.view.suffix=.html

database
spring.datasource.url: jdbc:mariadb://localhost:3306/hanvitHancom?characterEncoding=utf8
spring.datasource.username: 아이디
spring.datasource.password: 비밀번호
spring.datasource.driver-class-name: org.mariadb.jdbc.Driver

mybatis.config=mybatis/mybatis-config.xml
mybatis.mapper-locations: mybatis/mapper/*.xml
