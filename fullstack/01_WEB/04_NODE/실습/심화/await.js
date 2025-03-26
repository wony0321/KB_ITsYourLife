async function init() {
  const user = await fetch('https://jsonplaceholder.typicode.com/users');

  try {
    console.log(user);
  } catch (e) {
    console.log(e);
  }
}

init();
