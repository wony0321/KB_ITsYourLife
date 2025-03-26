var num = 10;
var test2 = '10';

console.log('num은 ', num);

console.log(`num은 ${num}, test2는 ${test2}`);

let fruits = ['사과', '바나나', '오렌지'];
console.log(fruits);
console.log(fruits[4]);
fruits.push('망고');
console.log(fruits);
fruits.pop();
console.log(fruits);
console.log(fruits.length);

// 뒤에서 선언 되었음에도 위의 코드에도 영향을 주는 것이 hoisting
var variable = 0;
