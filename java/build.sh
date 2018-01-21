for d in `ls -d */`
do
    cd $d
    BENCHMARKS=`ls -d */ 2> /dev/null`
    if [ $? -eq 0 ]
    then
    for b in $BENCHMARKS
    do
        if [ -e ${b}Main.java ]
        then
            cd $b
            javac Main.java
            NAME="`basename $b`.jar"
      	    jar cf ../$NAME `find . -name '*.class'`
            echo $NAME
            cd ..
        fi
    done
    fi
    cd ..
done
