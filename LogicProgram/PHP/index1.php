<?php

$helloworld = ['H', '-', 'e', '-', 'l','-', 'o'];
for($i = 0; $i < count($helloworld); $i++){
    if($helloworld[$i] == '-'){
        continue;
    }
    $string = $helloworld[$i];
}
echo $string;
?>