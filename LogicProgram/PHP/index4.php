<?php

//[] != [] nums 

$arr0 = array('A','B','C');
$arr1 = array();

for($i = 0; $i < count($array); $i++){
    $vt = $arr0[$i];
    if(!isset($arr1[$vt])){
        $arr1[$vt] = 0;
    }else{
        $arr1[$vt]++;
    }
}

foreach($arr1 as $key => $value){
    echo $key;
    echo "<hr>";
    echo $value;
}

?>