/**
 * 이름이 있는 내보내기
 * - 여러 값을 내보낼 수 있다.
 * - 반드시 기존 이름을 사용하거나 as를 통해 별칭을 부여
 *
 */

export const name = '홍길동';
export const age = 20;

export function greet() {
  return `안녕하세요 ${name}입니다.`;
}

// export default greet;
// export { name, age };
