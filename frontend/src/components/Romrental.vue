<template>

<v-card style="width:300px; margin-left:5%;" outlined>
    <template slot="progress">
      <v-progress-linear
        color="deep-purple"
        height="10"
        indeterminate
      ></v-progress-linear>
    </template>

    <v-img
      style="width:290px; height:150px; border-radius:10px; position:relative; margin-left:5px; top:5px;"
      src="https://cdn.vuetifyjs.com/images/cards/cooking.png"
    ></v-img>

    <v-card-title v-if="value._links">
        Romrental # {{value._links.self.href.split("/")[value._links.self.href.split("/").length - 1]}}
    </v-card-title >
    <v-card-title v-else>
        Romrental
    </v-card-title >

    <v-card-text style = "margin-left:-15px; margin-top:10px;">

          <div class="grey--text ml-4" v-if="editMode" style = "margin-top:-20px;">
            <v-text-field label="ReserveId" v-model="value.reserveId"/>
          </div>
          <div class="grey--text ml-4" v-else>
            ReserveId :  {{value.reserveId }}
          </div>

          <div class="grey--text ml-4" v-if="editMode" style = "margin-top:-20px;">
            <v-text-field label="PhoneId" v-model="value.phoneId"/>
          </div>
          <div class="grey--text ml-4" v-else>
            PhoneId :  {{value.phoneId }}
          </div>

          <div class="grey--text ml-4" v-if="editMode" style = "margin-top:-20px;">
            <v-text-field label="Country" v-model="value.country"/>
          </div>
          <div class="grey--text ml-4" v-else>
            Country :  {{value.country }}
          </div>

          <div class="grey--text ml-4" v-if="editMode" style = "margin-top:-20px;">
            <v-text-field label="Amount" v-model="value.amount"/>
          </div>
          <div class="grey--text ml-4" v-else>
            Amount :  {{value.amount }}
          </div>

          <div class="grey--text ml-4" v-if="editMode" style = "margin-top:-20px;">
            <v-text-field label="ReserveDate" v-model="value.reserveDate"/>
          </div>
          <div class="grey--text ml-4" v-else>
            ReserveDate :  {{value.reserveDate }}
          </div>

          <div class="grey--text ml-4" v-if="editMode" style = "margin-top:-20px;">
            <v-text-field label="ReservCancelDate" v-model="value.reservCancelDate"/>
          </div>
          <div class="grey--text ml-4" v-else>
            ReservCancelDate :  {{value.reservCancelDate }}
          </div>

          <div class="grey--text ml-4" v-if="editMode" style = "margin-top:-20px;">
            <v-text-field label="ReservReturnDate" v-model="value.reservReturnDate"/>
          </div>
          <div class="grey--text ml-4" v-else>
            ReservReturnDate :  {{value.reservReturnDate }}
          </div>

          <div class="grey--text ml-4" v-if="editMode" style = "margin-top:-20px;">
            <v-text-field label="RentAcceptDate" v-model="value.rentAcceptDate"/>
          </div>
          <div class="grey--text ml-4" v-else>
            RentAcceptDate :  {{value.rentAcceptDate }}
          </div>

          <div class="grey--text ml-4" v-if="editMode" style = "margin-top:-20px;">
            <v-text-field label="RentCancelDate" v-model="value.rentCancelDate"/>
          </div>
          <div class="grey--text ml-4" v-else>
            RentCancelDate :  {{value.rentCancelDate }}
          </div>

          <div class="grey--text ml-4" v-if="editMode" style = "margin-top:-20px;">
            <v-text-field label="RetAcceptDate" v-model="value.retAcceptDate"/>
          </div>
          <div class="grey--text ml-4" v-else>
            RetAcceptDate :  {{value.retAcceptDate }}
          </div>

          <div class="grey--text ml-4" v-if="editMode" style = "margin-top:-20px;">
            <v-text-field label="RetalStatus" v-model="value.retalStatus"/>
          </div>
          <div class="grey--text ml-4" v-else>
            RetalStatus :  {{value.retalStatus }}
          </div>


    </v-card-text>

    <v-divider class="mx-4"></v-divider>

    <v-card-actions style = "position:absolute; right:0; bottom:0;">
      <v-btn
        color="deep-purple lighten-2"
        text
        @click="edit"
        v-if="!editMode"
      >
        Edit
      </v-btn>
      <v-btn
        color="deep-purple lighten-2"
        text
        @click="save"
        v-else
      >
        Save
      </v-btn>
      <v-btn
        color="deep-purple lighten-2"
        text
        @click="remove"
        v-if="!editMode"
      >
        Delete
      </v-btn>
    </v-card-actions>
  </v-card>


</template>

<script>
  const axios = require('axios').default;

  export default {
    name: 'Romrental',
    props: {
      value: Object,
      editMode: Boolean,
      isNew: Boolean
    },
    data: () => ({
        date: new Date().toISOString().substr(0, 10),
    }),

    methods: {
      edit(){
        this.editMode = true;
      },
      async save(){
        try{
          var temp = null;

          if(this.isNew){
            temp = await axios.post(axios.fixUrl('/romrentals'), this.value)
          }else{
            temp = await axios.put(axios.fixUrl(this.value._links.self.href), this.value)
          }

          this.value = temp.data;

          this.editMode = false;
          this.$emit('input', this.value);

          if(this.isNew){
            this.$emit('add', this.value);
          }else{
            this.$emit('edit', this.value);
          }

        }catch(e){
          alert(e.message)
        }
      },
      async remove(){
        try{
          await axios.delete(axios.fixUrl(this.value._links.self.href))
          this.editMode = false;
          this.isDeleted = true;

          this.$emit('input', this.value);
          this.$emit('delete', this.value);

        }catch(e){
          alert(e.message)
        }
      },

    }
  }
</script>

