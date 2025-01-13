SELECT count(*) as count FROM ecoli_data
WHERE genotype & 2 = 0
AND (genotype & 1 = 1 or genotype & 4 = 4);