<?php
$str_one = 'The most direct computation would be for the enemy to try all 2^r possible keys, one by one.';
$str_two = 'The significance of this general conjecture, assuming its truth, is easy to see. It means that it may be feasible to design ciphers that are effectively unbreakable.';
$str_three = 'In this letter I make some remarks on a general principle relevant to enciphering in general and my machine.';
$str_four = 'We see immediately that one needs little information to begin to break down the process.';

// $msg_strings['msgs'] = array [
// 	array['pt' => $str_one, 'hex' => unpack('H*', $str_one), 'hex_chunks' => str_sp,
// 	array['pt' => $str_two],
// 	array['pt' => $str_three],
// 	array['pt' => $str_four]
// ]; 

$msgs = array();
$msgs[] = $str_one;
$msgs[] = $str_two;
$msgs[] = $str_three;
$msgs[] = $str_four;

foreach($msgs as $msg) {
	static $i = 0;
	//print $msg;
	$str_hex = unpack('H*', $msg);
	//print_r($str_hex);
	$hex_chunks = str_split($str_hex[1],2);
	$hex_len = strlen($str_hex[1]) / 2;
	print "String #$i lenght: ".$hex_len."\n";
	$i++;
}
// $m_one = str_pad(base_convert('5210722b', 16, 2),32,"0",STR_PAD_LEFT);
// $m_two = str_pad(base_convert('bbe033c0', 16, 2),32,"0",STR_PAD_LEFT);
//$m_one = '01010010000100000111001000101011';
//$m_two = '10111011111000000011001111000000';
// print $m_one."\n";
// print $m_two."\n";
// $x_one_and_two = intval($m_one) ^ intval($m_two);
// print $x_one_and_two;
//d
//rl
//01010010000100000111001000101011
//10111011111000000011001111000000
//lr
//01011111011001111010101110101111
//00001011110010010011001100001110

//c
//rl
//11001011001010001101100001100011
//01110101111001011110001111101010
//lr
//10011101000110100100111101111000
//01110111001111101100001111100110

//b
//rl
//11111101110001001000101111111011
//00110010010100000011001010101001
//lr
//01111100001010000010001011101011
//11000101111000100011011001001011

//a
//rl
//11100001001110000111101011101001
//00010111100100101101001000011101
//lr
//11101000011011010010110111100010
//10110110010001011100000000001000

?>
