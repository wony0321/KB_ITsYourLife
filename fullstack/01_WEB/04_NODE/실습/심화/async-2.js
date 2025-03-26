function pizza() {
  const promise = new Promise((resolve, reject) => {
    const result = '피자를 주문했습니다.';

    if (!result) {
      const e = new Error('피자를 주문하지 않았습니다.');
      return reject(e);
    } else {
      resolve(result);
    }
  });

  return promise;
}

pizza()
  .then((message) => {
    console.log(message);
  })
  .catch((error) => {
    console.log(error.message);
  });
