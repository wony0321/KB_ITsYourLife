// Json
// JavaScript Object notation (자바스크림트 객체 표기법)
/**
 * {
 *      "name": "임예원",
 *      "email": "lyw1212@gmail.com"
 * }
 */

fetch('https://jsonplaceholder.typicode.com/todos/1')
  .then((response) => response.json())
  .then((json) => {
    const extendedData = { ...json };
    console.log('가져온 데이터:', json);

    extendedData.title = '변경된 속성';
    console.log('확장된 데이터:', extendedData);
  });
