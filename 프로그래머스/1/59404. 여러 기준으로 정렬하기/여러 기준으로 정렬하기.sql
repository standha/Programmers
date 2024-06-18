-- 코드를 입력하세요
SELECT ANIMAL_ID,	NAME,	DATETIME
FROM ANIMAL_INS
ORDER BY NAME ASC -- 이름 순으로 정렬(오름차순)
,DATETIME DESC; -- 이름으로 정렬 후 이름이 같으면 보호 시작일이 늦은 것부터 정렬(내림차순)
