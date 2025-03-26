function displayA() {
  console.log('A');
}
function displayB(func) {
  setTimeout(() => {
    console.log('<<2초 경과 후>>');
    console.log('B');

    func();
  }, 3000);
}

function displayC() {
  console.log('C');
}

displayA();
displayB(displayC);
