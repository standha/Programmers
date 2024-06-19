-- 코드를 입력하세요
SELECT COUNT(USER_ID)
FROM USER_INFO
-- 숫자 조건 걸때는  BETWEEN A AND B
WHERE AGE BETWEEN 20 AND 29
-- 날짜 조건 (TO_DATE())
AND JOINED BETWEEN TO_DATE('2021-01-01', 'yyyy-mm-dd') AND to_date('2021-12-31', 'yyyy-mm-dd');
