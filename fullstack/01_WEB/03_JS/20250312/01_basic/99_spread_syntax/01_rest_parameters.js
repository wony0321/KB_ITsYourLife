// rest Parameter (나머지 매개변수)
function merge(msg1, msg2) {
  return msg1 + msg2;
}

// 뒤에껀 무시됨
console.log(merge('하하', '나참', '안녕', '하세요'));

function mergeAll(...args) {
  let message = '';

  for (let arg of args) {
    message += arg;
  }
  return message;
}

console.log(mergeAll('하하', '나참', '안녕', '하세요'));

// (...) 나머지 매개변수는 항상 마지막에 있어야 한다.
function mergeAll2(arg1, ...args) {}
