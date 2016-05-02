<?php
	echo "Starting ffmpeg...\n\n";
	echo shell_exec("ffmpeg -i converted.mp4 -c:v libx264 -b:v 150k  -c:a aac -strict -2 -b:a 64k  -flags -global_header -map 0 -segment_time 16 -f segment  -segment_list myvideo.m3u8 -segment_format mpegts str%05d.ts");
	echo "Done.\n";
?>

