const ansiColors = require('ansi-colors');

function hello(n) {
  console.log(`${ansiColors.green(n)}님, 안녕하세요?`);
}

hello('임예원');

// Error: Cannot find module 'ansi-colors'
