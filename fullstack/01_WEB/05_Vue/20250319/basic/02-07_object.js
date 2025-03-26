const user = {
  name: 'Alice',
  age: 25,
  job: 'Developer',
};

// 1. 객체 구조분해할당
// key값을 할당하기 때문에 순서와 상관없이 해당 이름의 값 가지고옴
const { age, name } = user;
console.log(name, age); // Alice 25

// 2. 변수 이름 변경
const { name: userName, job: profession } = user;
console.log(userName, profession); // Alice, Developer

// 3. 기본값 설정
const { salary = 5000, age: userAge = 30 } = user;
console.log(salary, userAge); // 5000 25 }

// 4. 중첩된 객체 구조 분해
const person = {
  name: 'Bob',
  info: {
    address: 'Seoul',
    hobbies: ['reading', 'coding'],
  },
};

// 구조분해할당을 통해 이름과 첫 번째 취미를 출력하시오.
const {
  name: personName,
  info: {
    hobbies: [firstHobby],
  },
} = person;
console.log(`이름: ${personName}, 첫 번째 취미: ${firstHobby}`); // Bob reading

// const {
//     name,
//     info: {
//         address,
//         hobbies: [firstHobby, secondHobby],
//     },
// } = person;
