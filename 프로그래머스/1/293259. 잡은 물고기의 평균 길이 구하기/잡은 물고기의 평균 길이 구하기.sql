-- 코드를 작성해주세요
--IFNULL(컬럼명, 대체할 값)->해당 걸럼이 만약 NULL이면 대체할 값으로 변경함
--ROUND(값, 자리수)->특정 소수점을 반올림
SELECT ROUND(AVG(IFNULL(LENGTH, 10)), 2) AS AVERAGE_LENGTH
FROM FISH_INFO;
