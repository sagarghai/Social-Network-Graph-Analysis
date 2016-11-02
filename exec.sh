# @Author: sagar
# @Date:   2016-05-26 16:03:18
# @Last Modified by:   sagar
# @Last Modified time: 2016-05-26 16:39:29

#for (( i = 1; i <=10; i=i+1 ))  	
#do
	#	(time hadoop jar dj.jar DijikstraAlgo $i) 2>> $i
	#	hadoop fs -rmr /user/sagar/output/
#	done

(time hadoop jar dj.jar DijikstraAlgo 20) 2>> 12_20
