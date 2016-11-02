# Social-Network-Graph-Analysis

In the modern world, social networks like facebook and twitter have really taken a toll. The
massive amount of data that these websites are generating is a huge mine of information.
With the rise in Big Data technologies like Hadoop and Mapreduce, analysing and
visualisation of this data has become very easy and fast. Each network has some form of a
relation between its nodes. Social network relations could be expressed using graphs.
Graphs are one of the most used data structure in computer science. With the growth of
social networks the graphs used to represent these relations have also become very
complex. For the analysis of these graphs various algorithms have been developed,some
are sequential and some are parallel. Our aim here is to find the distance of all the nodes of
a social graph from a fixed source node, often this problem is referred to as single source
shortest path. Sequentially this could be solved using Dijkstra's Algorithm but we will be
using parallel Breadth First Search to solve this problem to achieve concurrency. The
algorithm makes use of the Mapreduce paradigm of programming over Hadoop Distributed
File system. Apart from the technical perspective this problem has a lot of social
significance. We will use our results to check the validity of one very famous theory by
Frigyes Karinthy ,called the Six Degrees of Separation.
We have discussed the results in the form of plots and figures and the algorithms and
theories are explained in corresponding sections.