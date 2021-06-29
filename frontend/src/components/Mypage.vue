<template>

<v-data-table
    :headers="headers"
    :items="mypage"
    :items-per-page="5"
    class="elevation-1"
  ></v-data-table>

</template>

<script>
  const axios = require('axios').default;

  export default {
    name: 'Mypage',
    props: {
      value: Object,
      editMode: Boolean,
      isNew: Boolean
    },
    data: () => ({
        headers: [
            { text: "id", value: "id" },
            { text: "reservceId", value: "reservceId" },
            { text: "amount", value: "amount" },
            { text: "reserveDate", value: "reserveDate" },
            { text: "country", value: "country" },
            { text: "returnDate", value: "returnDate" },
            { text: "cancelDate", value: "cancelDate" },
            { text: "status", value: "status" },
            { text: "rentAcceptDate", value: "rentAcceptDate" },
            { text: "rentCancelDate", value: "rentCancelDate" },
            { text: "retAcceptDate", value: "retAcceptDate" },
            { text: "payCancelDate", value: "payCancelDate" },
            { text: "userPhone", value: "userPhone" },
            { text: "phoneId", value: "phoneId" },
            { text: "payType", value: "payType" },
            { text: "payCompany", value: "payCompany" },
            { text: "payNumber", value: "payNumber" },
        ],
        mypage : [],
    }),
    async created() {
      var temp = await axios.get(axios.backend + '/mypages')

      this.mypage = temp.data._embedded.mypages;

    },
    methods: {
    }
  }
</script>

