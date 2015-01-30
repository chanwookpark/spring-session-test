
초 간단 Spring Session + Redis 샘플.
Spring Session 샘플은 모두 Embedded Redis여서 실제 Redis 설치하고 돌리면 잘 되는지 확인하고 싶었서 만들어 봤습니다..;
진짜로 되는지를 확인했으니 여러 케이스를 테스트 하는 코드를 좀 더 넣어보도록 하겠습니다.

# 테스트 방법
1. 체크아웃: Gradle 프로젝트로 2개의 서브모듈(server1, server2)로 되어 있음
2. redis 설치 (초간단 설치: http://redis.io/download)
2. server1 실행하고 확인
   - gradle의 'run' command 실행하고 http://localhost:8081/로 접근해 'Server1' 메세지 보면 ok
3. server2 실행
   - gradle의 'run' command 실행하고 http://localhost:8082/로 접근해 'Server2' 메세지 보면 ok
4. server1이나 server2에서 HTTP 파라미터로 'v=xxx'로 메시지를 주면 이 값을 Session에 저장하고 해당 서버 콘솔에 xxx 값이 찍힘
5. 1로 파라미터를 줬으면 2번 서버로, 2번 서버로 줬으면 1번 서버로 파라미터 없이 접근했을 때 Session에서 메시지를 꺼내와 찍어주면 ok