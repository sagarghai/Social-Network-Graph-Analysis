# @Author: sagar
# @Date:   2016-05-26 18:45:38
# @Last Modified by:   sagar
# @Last Modified time: 2016-05-26 20:58:29
a=8388608
for (( i = 1; i <=10; i=i+1 ))
    	do
    		a=$a*$i
		(time hadoop jar dj.jar DijikstraAlgo $a) 2>> $i
		hadoop fs -rmr /user/sagar/output/
	done
