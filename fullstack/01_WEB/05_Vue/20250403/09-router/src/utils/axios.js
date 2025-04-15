import axios from 'axios'

// axios 인스턴스 분리
// 공통된 설정을 한 곳에서 처리 가능
const instance = axios.create({
  baseURL: 'http://localhost:5000',

  // timeout: axios로 외부 요청을 보낼 때, 무한정으로 보내는게 아니라 제한 시간 두는 것
  // 아래 코드는 5초 동안 안오면 넘어가게 되는 코드임
  timeout: 5000,
})

export default instance
