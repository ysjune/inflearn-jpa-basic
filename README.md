## h2 데이터베이스 생성 오류 시
> Database "/test" not found, either pre-create it or allow remote database creation (not recommended in secure environments) [90149-214] 90149/90149

1. h2콘솔에서 JDBC URL에 `jdbc:h2:~/test` 로 입력
2. 접속 성공 시, 이후부턴 `jdbc:h2:tcp://localhost/~/test` 로 접속

