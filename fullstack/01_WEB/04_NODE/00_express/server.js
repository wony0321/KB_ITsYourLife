const express = require('express');

const app = express();

app.get('/api/hello', (req, res) => {
  res.send('안녕하세요 임예원입니다');
});
z;

app.listen(3000, () => {
  console.log(`서버가 3000포트에서 실행 중입니다.`);
});
