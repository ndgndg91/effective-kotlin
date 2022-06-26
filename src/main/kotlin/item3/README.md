# 최대한 플랫폼 타입을 사용하지 말라
<pre>
    다른 프로그래밍 언어에서 와서 nullable 여부를 알 수 없는 타입을 플랫폼 타입이라고 부른다. 
    이러한 플랫폼 타입을 사용하는 코드는 해당 부분만 위험한 것이 아니라, 이를 활용하는 곳까지 영향을 줄 수 있는 위험한 코드다.
    따라서 이런 코드를 사용하고 있다면 빨리 해당 코드를 제거하는 것이 좋다.
    또한 연결되어 있는 자바 생성자, 메서드, 필드에 nullable 여부를 지정하는 어노테이션을 활용하는 것이 좋다.
    이러한 정보는 코틀린, 자바 개발자 모두에게 좋다.
</pre>

## 어노테이션 example
- org.jetbrain.annotations @Nullable, @NotNull
- javax.annotation @Nullable, @CheckForNull, @Nonnull
- lombok @NonNull