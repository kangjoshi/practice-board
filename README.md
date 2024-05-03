### kubernetes 실습
- Web application 환경을 kubernetes로 구성해 보자

#### 스펙
- board-be: 게시판 BE (Spring Boot)
- board-fe: 게시판 FE (Nuxt)

#### 실습 목표 - 궁금한 거 다 해보자
- [X] be, fe를 띄어서 게시판 서비스
- [X] Livenessprobe, ReadinessProbe 설정
- [X] mysql 구성하여 연결
- [X] ingress 설정
  - nginx ingress
- [X] 어플리케이션 환경 변수 configmap으로 관리
- [ ] log 취합