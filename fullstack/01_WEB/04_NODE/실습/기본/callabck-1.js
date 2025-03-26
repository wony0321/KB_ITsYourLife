const order = (text, func) => {
  console.log('아메리카토 주문 접수');
  setTimeout(() => {
    console.log('<<3초 경과 후>>');
    func(text);
  }, 3000);
};
const display = (result) => {
  console.log(`${result} 완료!`);
};
order('아메리카노', display);
