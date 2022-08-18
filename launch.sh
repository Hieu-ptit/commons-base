set -e
#if [ -z "$1" ]; then
#  echo './launch.sh DEV or ./launch.sh PROD'
#  exit
#elif [ "$1" != DEV ] && [ "$1" != PROD ] && ["$1" != DEV_VIETTEL ]; then
#  echo './launch.sh DEV or ./launch.sh PROD'
#  exit
#fi

#git pull

#./gradlew bootJar
#./gradlew --stop
# shellcheck disable=SC2164
#cd build/libs

if [ "$1" == WOFM_API ]; then
  echo "Uploading ... "
  scp api/target/fair-api-1.0.0-SNAPSHOT.jar root@159.223.81.203:/opt/fair-api/fair-api-1.0.0-SNAPSHOT.jar
  echo "Uploaded !"
  echo "Deploying !"
  ssh root@159.223.81.203 'systemctl restart fair-api'

elif [ "$1" == WOFM_CORE ]; then
  echo "Uploading ... "
  scp core/target/fair-core-1.0.0-SNAPSHOT.jar root@159.223.81.203:/opt/fair-core/fair-core-1.0.0-SNAPSHOT.jar
  echo "Uploaded !"
  echo "Deploying !"
  ssh root@159.223.81.203 'systemctl restart fair-core'

fi

echo "Completed !"

# bash -e launch.sh WOFM_API
# bash -e launch.sh WOFM_CORE
