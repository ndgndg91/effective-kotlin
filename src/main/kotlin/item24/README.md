# 제너릭 타입과 variance 한정자를 활용하라

## 정리

- invariant - <T> 
- covariant - <out T>
- contravariant <in T>
---
- 타입 파라미터의 기본적인 variance 의 동작은 invariant 입니다. 만약 Cup<T> 라고 하면, 타입 파라미터 T 는 invariant 입니다. 
A가 B의 서브타입이라고 할 때, Cup\<A> 와 Cup\<B> 는 아무런 관계가 없습니다.
- out 한정자는 타입 파라미터를 covariant 하게 만듭니다. 만약 Cup\<T> 라고 하면, 타입 파라미터 T 는 covariant 입니다.
A가 B의 서브타입이라고 할 때, Cup\<A> 는 Cup\<B> 의 서브타입이 됩니다. covariant 타입은 out 위치에 사용할 수 있습니다.
- in 한정자는 타입 파라미터를 contravariant 하게 만듭니다. 만약 Cup\<T> 라고 하면, 타입 파라미터 T 는 contravariant 입니다.
A 가 B의 서브타입이라고 할 때, Cup\<B> 는 Cup\<A> 의 슈퍼타입이 됩니다. contravariant 타입은 in 위치에 사용할 수 있습니다.