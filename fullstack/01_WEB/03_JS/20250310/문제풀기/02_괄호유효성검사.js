const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

let input = '';

rl.question('값을 입력하세요 : ', (answer) => {
  input = answer;

  const stack = [];

  const bracktPairs = {
    '(': ')',
    '{': '}',
    '[': ']',
  };

  const checkBrackets = function (brack) {
    for (b in brack) {
      if (brack[b] == '(' && brack[b] == '{' && brack[b] == '[') {
        stack.push(brack[b]);
      } else if (brack[b] == ')' && brack[b] == '}' && brack[b] == ']') {
        if (stack.length === 0) {
          return false;
        }

        let last_brack = stack.pop();
        if (bracktPairs[last_brack] !== brack[b]) {
          return false;
        }
      }
    }
    return stack.length === 0;
  };

  checkBrackets(input);

  rl.close();
});
