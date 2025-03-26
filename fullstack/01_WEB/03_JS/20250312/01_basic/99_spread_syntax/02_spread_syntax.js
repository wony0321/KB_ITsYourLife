// 스프레드 문법
/**
 * 하나로 뭉쳐있는 여러 값들의 집합을 전개해서 개별적인 값 목록으로 만든다.
 *
 */

console.log(`가장 큰 값 : ${Math.max(1, 4, 70, 3)}`);

let arr = [1, 4, 70, 3];

console.log(arr);
console.log(...arr);

console.log(`가장 큰 값 : ${Math.max(...arr)}`);

let object = {
  key: 'value',
  key2: 'value2',
};

console.log({ ...object });
console.log(...Object.keys(object));
console.log(...Object.values(object));
console.log(...Object.entries(object));

// 배열 여러개 전달
let arr1 = [10, 20, 30];
let arr2 = [100, 300, 200];
console.log(`가장 작은 값 : ${Math.min(...arr1, ...arr2)}`);

// 일반 값과 혼합해서 사용 가능
console.log(`가장 큰 값 : ${Math.max(...arr1, 400, ...arr2)}`);

// 배열 합치기
let arr3 = [...arr1, ...arr2];
console.log(arr3);

// 문자열
let str = 'javascript';

console.log(str);
console.log(...str);
console.log([...str]);
