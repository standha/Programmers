/*
OUTER JOIN 연산자(+) : 데이터가 0이어도 조회하기 위해 OUTER JOIN 사용, 조인시킬 값이 없는 곳에 (+)를 위치시킴, 값 없으면 NULL로 표시
NVL(컬럼, '값이 NULL일 때 나타낼 값')
(LEVEL-1) : 시간대 0부터 시작
FROM DUAL CONNECT BY LEVEL <= 24 : 더미테이블 DUAL을 통해 시간대 24까지만 순번을 조회

시간을 00형식으로 형변환 시킨 후, 이를 그룹화 및 시간 순 정렬. 이 테이블은 A로 선언.
LEVEL을 통해 00부터 23까지의 목록을 만든 이 테이블은 B로 선언.

NULL인 값도 0으로 조회해야 하기 때문에 B와 A를 OUTER JOIN 시킴.
*/

SELECT B.HOUR, NVL(A.COUNT, 0) AS COUNT
FROM (
    SELECT TO_CHAR(DATETIME, 'HH24') AS HOUR, COUNT(*) AS COUNT
    FROM ANIMAL_OUTS
    GROUP BY TO_CHAR(DATETIME, 'HH24')
    ORDER BY HOUR
    ) A,
    (
    SELECT (LEVEL-1) AS HOUR
    FROM DUAL CONNECT BY LEVEL <= 24
    ) B
WHERE B.HOUR = A.HOUR(+) 
ORDER BY HOUR;