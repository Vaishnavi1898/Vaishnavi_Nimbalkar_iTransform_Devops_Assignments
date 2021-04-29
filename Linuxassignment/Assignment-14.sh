season=('1=Summer' '2=Monsoon' '3=Winter')
echo "${season[@]}"
echo "Choose any season"
read season
case $season in
[1])
echo " Summer season is the hottest season of the year. In the summer season,
 the day is longer and the nights are shorter. 
 The sky becomes clearer and the sun shines bright."
;;
[2])
echo "The rainy season is one of the most favorite seasons of all individuals including kids, young and older people."
;;
[3])
 echo "Winter season is the coldest season which starts in the month of December and last till mid of March."
 ;;
*)
echo "Unknown season"
;;
esac