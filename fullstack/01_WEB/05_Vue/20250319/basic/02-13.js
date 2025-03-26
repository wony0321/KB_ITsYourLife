let obj = { result: 0 };

obj.add = function (x, y) {
  function inner() {
    // 여기서의 this가 전역으로의 result가 된 것
    // 자기 자신을 가리키는게 아니라 전역 객체를 가리킴

    this.result = x + y;
  }
  inner();
};

obj.add(3, 4);
console.log(obj); // { result: 0, add: [Function (anonymous)] }
// console.log(result); // 7

console.log(obj.result); // 0
// console.log(result); // 7

obj.add = function (x, y) {
  const inner = () => {
    // 여기서의 this가 전역으로의 result가 된 것
    // 자기 자신을 가리키는게 아니라 전역 객체를 가리킴

    this.result = x + y;
  };
  inner();
};

obj.add(3, 4);
// 화살표 함수로 바꾸면 this가 obj가 됨
console.log(obj.result); // 7

// 2. bind
// 함수의 this 값을 특정 객체에 영구적으로 바인딩한 새로운 함수 반환
obj.add = function (x, y) {
  function inner() {
    this.result = x + y;
  }
  inner.bind(this)();
};

obj.add(3, 4);
console.log(obj.result);
