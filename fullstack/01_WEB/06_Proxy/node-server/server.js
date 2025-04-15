const express = require('express');
const app = express();
const port = 3000;

// get 요청 하나만 가져올 수 있게
app.get('/data', (req, res) => {
  res.json({
    message: '이 데이터는 CORS 정책으로 안보임!',
    data: [1, 2, 3, 4, 5],
  });
});

app.listen(port, () => {
  console.log('서버 실행 중 ...');
});
