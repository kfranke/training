<?php
//'61 74 74 61 63 6b 20 61 74 20 64 61 77 6e'
//'61747461636b206174206461776e'
//'61747461636b206174206461776e'
//'01100001 01110100 01110100 01100001 01100011 01101011 00100000 01100001 01110100 00100000 01100100 01100001 01110111 01101110'
//'01100001 01110100 01110100 01100001 01100011 01101011 00100000 01100001 01110100 00100000 01100100 01100001 01110111 01101110'
//'6c73d5240a948c86981bc294814d'
//'6c73d5240a948c86981bc2808548'
//==============================================
//MESSAGE TEXT
//==============================================
$str = 'attack at dawn';
$str_hex = unpack('H*', $str);
$hex_chunks = str_split($str_hex[1],2);
$str_bins = array();
foreach ($hex_chunks as $chunk) {
	$str_bins[] = str_pad(base_convert($chunk, 16, 2),8,"0",STR_PAD_LEFT);	
}
$str_bin = implode($str_bins);
print "my message (".strlen($str_bin).") is:\n";
echo $str_bin;
print "\n";
//==============================================
//CIPHER TEXT
//==============================================
$ct = '6c73d5240a948c86981bc294814d';
$ct_hex_chunks = str_split($ct, 2);
$ct_bins = array();
foreach ($ct_hex_chunks as $ct_chunk) {
	$ct_bins[] = str_pad(base_convert($ct_chunk, 16, 2),8,"0",STR_PAD_LEFT);
}
$ct_bin = implode($ct_bins);
print "my cipher text (".strlen($ct_bin).") is:\n";
print $ct_bin;
print "\n";
//==============================================
//XOR KEY?
//==============================================
$str_bits = str_split($str_bin, 1);
$ct_bits = str_split($ct_bin, 1);
$xor_bits = array();
for ($i=0; $i < count($str_bits); $i++) { 
	$xor_bits[] = intval($str_bits[$i]) ^ intval($ct_bits[$i]);
	//print "$str_bits[$i] ^ $ct_bits[$i] = $xor_bits[$i]\n";
}
$xor_bin = implode($xor_bits);
print "my xord text (".strlen($xor_bin).") is:\n";
print $xor_bin;
print "\n";
//==============================================
//MESSAGE2 TEXT
//==============================================
$str_two = 'attack at dusk';
$str_two_hex = unpack('H*', $str_two);
$hex_two_chunks = str_split($str_two_hex[1],2);
$str_two_bins = array();
foreach ($hex_two_chunks as $chunk) {
	$str_two_bins[] = str_pad(base_convert($chunk, 16, 2),8,"0",STR_PAD_LEFT);	
}
$str_two_bin = implode($str_two_bins);
print "my message2 (".strlen($str_two_bin).") is:\n";
echo $str_two_bin;
print "\n";
//==============================================
//XOR MESSSAGE2
//==============================================
$str_two_bits = str_split($str_two_bin, 1);
$str_two_xor_bits = array();
for ($i=0; $i < count($str_two_bits); $i++) { 
	$str_two_xor_bits[] = intval($str_two_bits[$i]) ^ intval($xor_bits[$i]);
	// print "$str_two_bits[$i] ^ $xor_bits[$i] = $str_two_xor_bits[$i]\n";
}
$str_two_xor_bin = implode($str_two_xor_bits);
print "xord message2 (".strlen($str_two_xor_bin).") is:\n";
print $str_two_xor_bin;
print "\n";
$x = str_split($str_two_xor_bin, 16);
print_r($x);
foreach($x as $y){
	$hex[] = str_pad(base_convert($y, 2, 16), 4, "0", STR_PAD_LEFT);
}
print_r($hex);
print implode($hex);
?>