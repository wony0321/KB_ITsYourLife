const p1 = { name: 'john', age: 20 };

// 속성 변경은 가능
p1.age = 22;
console.log(p1); // { name: 'john', age: 22 }

p1 = { name: 'lee', age: 25 }; //TypeError: Assignment to constant variable.

// 객체를 재할당하는 것은 불가
