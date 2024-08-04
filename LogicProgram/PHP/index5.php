<?php

$azr = [];

for($i=0;$i<5;$i++){
    while(inArray($i,$azr[$i], $azr)){

    $azr[] = rand(1, 100);
    echo $azr[$i];
    echo '<br>';
}}

print_r($azr);
function inArray($indice,$valor,$azr){
    for($i=0;$i<count($azr);$i++){
        if($azr[$i] == $valor &&  $i != $indice){
            echo "repetiu";
            return true;
    }
}
return false;
}
?>