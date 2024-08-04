<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title></title>
</head>
<body>

	<?php

	if (isset($_POST['acao'])) {
		foreach ($_POST['valor'] as $key => $value) {
			echo $key;
			echo "->";
			echo $value;
		}
	}
	?>

	<form method="post">
		
		<hr>
		<select name="nome">
			<option>Guilherme</option>
			<option>Joao</option>
			<option>Pedro</option>
		</select>
		<input type="checkbox" name="valor[]" value="10">10
		<input type="checkbox" name="valor[]" value="10">20
		<input type="checkbox" name="valor[]" value="10">30
		<input type="checkbox" name="valor[]" value="10">40
		<input type="checkbox" name="valor[]" value="10">50
		<input type="submit" name="acao"/>
	</form>

</body>
</html>