<?php

//[] != [] nums 

$arr0 = array(0,1,2,3,4,5,6,"test");
$arr1 = array(10,90,23,8,6, 'test');


$cont=[];
for($i=0; $i < count($arr0); $i++){
    for($j=0; $j < count($arr1); $j++){
        if($arr0[$i] == $arr1[$j]){

            $cont[] = $arr0[$i];

        }
    }
}

foreach($cont as $key => $value){
echo $value;
}

?>