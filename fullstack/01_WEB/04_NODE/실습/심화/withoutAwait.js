const user = fetch('https://jsonplaceholder.typicode.com/users');

user
  .catch((m) => {
    console.log(m);
  })
  .then((e) => {
    console.log(e);
  });
