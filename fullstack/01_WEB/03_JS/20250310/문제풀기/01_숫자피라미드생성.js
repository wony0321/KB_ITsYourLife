const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

let input = '';

// 입력값으로 패턴 판복 횟수가 들어옴
// 그 횟수를 반복하면서 몇 번째 줄을 출력하는지 확인
// 그 해당 줄의 앞 부분에 있는 공백 수는
// 현재 보는 숫자 - 입력값임

rl.question('값을 입력하세요 : ', (answer) => {
  let input = parseInt(answer);

  let make_pyramid = (cur, total) => {
    let spaces = ' '.repeat(total - cur);
    let s = ' ' + cur.toString();
    let s_reap = s.repeat(cur);
    console.log(spaces + s_reap);
  };

  let pyramid = function (n) {
    for (let i = 1; i < n + 1; i++) {
      make_pyramid(i, n);
    }
  };

  pyramid(input);

  rl.close();
});
