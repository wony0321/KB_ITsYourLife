const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

let input = '';

rl.question('값을 입력하세요 : ', (answer) => {
  input = answer;
  let kor_num = '';

  const changeToKor = (n) => {
    switch (n) {
      case '1':
        kor_num = '일';
        break;
      case '2':
        kor_num = '이';
        break;
      case '3':
        kor_num = '삼';
        break;
      case '4':
        kor_num = '사';
        break;
      case '5':
        kor_num = '오';
        break;
      case '6':
        kor_num = '육';
        break;
      case '7':
        kor_num = '칠';
        break;
      case '8':
        kor_num = '팔';
        break;
      case '9':
        kor_num = '구';
        break;
      default:
        kor_num = '';
    }
  };

  const numberToKorean = function (num) {
    let num_len = num.length;
    let ans = '';

    for (let n in num) {
      changeToKor(num[n]);

      switch (num_len) {
        case 1:
          if (num[n] > 0) {
            ans += kor_num;
          }
          break;
        case 2:
          if (num[n] > 0) {
            ans += kor_num + '십';
          }
          break;
        case 3:
          if (num[n] > 0) {
            ans += kor_num + '백';
          }
          break;
        case 4:
          if (num[n] > 0) {
            ans += kor_num + '천';
          }
          break;
        case 5:
          if (num[n] > 0) {
            ans += kor_num + '만';
          }
          break;
      }
      num_len--;
    }
    console.log(ans);
  };

  numberToKorean(input);

  rl.close();
});
