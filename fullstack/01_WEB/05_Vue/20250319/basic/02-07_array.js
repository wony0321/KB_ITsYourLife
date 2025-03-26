// 배열 구조 분해 할당

const animals = ['bear', 'tiger', 'giraffe', 'elephant', 'lion'];

// 특정 값들을 빼서 쓰고 싶을 때 많이 사용함

// 1. 기본적인 구조분해할당
// const [ani1, ani2, ani3] = animals;
// console.log(ani1, ani2, ani3); // bear tiger giraffe

// 2. 일부 요소 건너뛰기
// const [, ani2, , ani4, ani5] = animals;
// console.log(ani2, ani4, ani5); // tiger elephant lion

// 3. 기본값 설정
// const zoo = ['panda', 'koala'];
// const [ani1, ani2, ani3 = 'monkey', ani4 = 'penguin'] = zoo;
// console.log(ani1, ani2, ani3, ani4); // panda koala monkey penguin

// 4. 중첩된 배열 구조 분해
const nestedArray = [1, [2, 3], 4];
// const [num1, numArr, num2] = nestedArray;
// console.log(num1, numArr, num2); // 1 [ 2, 3 ] 4

const [num1, [num3, num4], num2] = nestedArray;
console.log(num1, num3, num4, num2); // 1 2 3 4
