/**
 * 동기 작업
 * : 하나의 작업을 실행하고 다음 작업을 순차적으로 실행함
 *
 * 비동기 작업
 * : 메인 흐름은 멈추지 않는 상태에서 특정 작업들을 백그라운드에서 처리해 동시에 처리하는 것처럼 실행 (넌블로킹)
 */

function sayHello() {
  console.log('Hello Hello Hello');
}

sayHello();
sayHello();
setTimeout(sayHello, 3000);
console.log('end');
