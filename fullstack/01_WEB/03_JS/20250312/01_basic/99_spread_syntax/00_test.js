const obj = {
  name: '개냥이',
  age: 2,
};

function print(obj, key) {
  return obj[key];
}

// function print(obj, key) {
//     return obj.key;
// }

/* 
이건 obj의 매개변수로 받아온 key에 해당하는 값을 대입하는게 아닌, 
 key라는 속성을 참조한다는 뜻이 되어버린다.
function print(obj, key) {
    return obj.key;
}
*/

console.log(print(obj, 'name'));
