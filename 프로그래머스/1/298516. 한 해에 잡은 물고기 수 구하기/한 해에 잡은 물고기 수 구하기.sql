SELECT count(*) as FISH_COUNT
FROM FISH_INFO
WHERE date_format(TIME,'%Y') IN ('2021');