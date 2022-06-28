# use 를 사용하여 리소스를 닫아라

- use 를 사용하면 Closeable / AutoCloseable 을 구현한 객체를 쉽고 안전하게 처리할 수 있다.
- 파일을 처리할 때는 파일을 한 줄씩 읽어 들이는 useLines 을 사용하는 것이 좋다.