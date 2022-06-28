# 적절하게 null 을 처리하라

- safe call
- smart casting
- Elvis 연산자
---
### defensive programming, offensive programming 적절한 활용

- require, check, requireNonNull, throw 를 통하여 적절하게 혼용한다.

---

### not-null assertion(!!) - null 이 아니라고 확신할 경우 사용하지만, null 일 경우 NPE 를 발생시키기 때문에 조심해야한다.

---
### 의미 없는 nullability 피하기 - null 은 중요한 메세지를 나타내기 위해서만 사용해야한다. nullability 는 추가 비용이다.
- List<T> get 과 getOrlNull
- lateinit 프로퍼티와 notNull Delegate 활용하기
- 컬렉션 사용 시 null 대신 empty collection 사용하기
- 
